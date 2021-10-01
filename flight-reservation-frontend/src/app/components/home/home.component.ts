import { StringMapWithRename } from '@angular/compiler/src/compiler_facade_interface';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Search } from 'src/app/model/Search';
import { FlightService } from 'src/app/services/flight.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  data:Search = new Search();
  
  constructor(private flightService:FlightService, private router:Router) { }

  ngOnInit(): void {
 
   
  }

  public onSubmit(data:Search){
    this.flightService.getFlights(data.from as string, data.to as string).subscribe(
      ()=>{
        this.router.navigate(['flight'])
      }
    )
  }

}
