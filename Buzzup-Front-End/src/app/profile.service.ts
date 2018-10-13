import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {
  private _url = 'http://127.0.0.1:9073';
  constructor(private http: HttpClient) {}
}
