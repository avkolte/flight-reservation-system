import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { Flight } from 'src/app/model/Flight';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { FlightService } from 'src/app/services/flight.service';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent implements OnInit {





  data:any;
  constructor(private flightService:FlightService, private router:Router, private authenticationService:AuthenticationService) { }

    
   

  ngOnInit(): void {
    this.data = this.flightService.flightData;
  }

  public onSelect(id:number):any{

    if(this.authenticationService.isUserLoggedIn())
    {
      this.router.navigate(['/passenger/'+id]);
    }
    
    else{
      alert("Please login to book flight");
    }
    

  }

  

}
