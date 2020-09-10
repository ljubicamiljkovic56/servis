import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class LoginService {

  //uri = 'http://localhost:8080';
  uri = '/api';

  constructor(private http:HttpClient) { }


  // getUsers(){
  //   return this.http.get(`${this.uri}/students`);
  // }

}
