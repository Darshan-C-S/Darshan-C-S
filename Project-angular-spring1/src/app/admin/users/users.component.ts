import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../../model/User';
import { HttpClientService } from '../../service/http-client.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  users: Array<User>;
  selectedUser: User;
  action: string;

  constructor(private httpClientService: HttpClientService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

    ngOnInit() {
      this.refreshData();
     }
   
     refreshData() {
       this.httpClientService.getUsers().subscribe(
         response => this.handleSuccessfulResponse(response),
       );
   
       this.activatedRoute.queryParams.subscribe(
        (params) => {
          this.action = params['action'];
          const selectedUserId = params['id'];
          if (selectedUserId) {
            this.selectedUser = this.users.find(user => user.id === +selectedUserId);
          }
        }
      );
    }
   
     handleSuccessfulResponse(response) {
       this.users = response;
       console.log(this.users);
     }
   
     viewUser(id: number) {
      this.router.navigate(['admin','users'], {queryParams : {id, action: 'view'}});
    }
  
     addUser() {
       this.selectedUser = new User();
       this.router.navigate(['admin', 'users'], { queryParams: { action: 'add' } });
     }
   
   
  // this.users = new Array<User>();

  // const user1 = new User();
  // user1.id = 1;
  // user1.name = 'user1';
  // user1.type = 'admin';
  // user1.password = 'pass';

  // const user2 = new User();
  // user2.id = 2;
  // user2.name = 'user2';
  // user2.type = 'user';
  // user2.password = 'pass';

  // this.users.push(user1);
  // this.users.push(user2);

}
