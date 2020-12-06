package org.sreeni.javasr.jaxrs;

import org.sreeni.javasr.Country;
import java.util.ArrayList;
import java.util.List;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

/* 
 * author: Sreeni
 * */
@Path("/countries")
public class CountryRestService {
 
    @GET
    @Produces(MediaType.APPLICATION_JSON)
 public List getCountries()
 {
  List listOfCountries = new ArrayList();
  listOfCountries=createCountryList();
  return listOfCountries;
 }
 
    
 @GET
    @Path("{id: d+}")
    @Produces(MediaType.APPLICATION_JSON)
 public Country getCountryById(@PathParam("id") int id)
 {
  List<Country> listOfCountries = createCountryList();
 
  for (Country country1 : listOfCountries) {
   if(country1.getId()==id)
    return country1;
  }
  
  return null;
 }
 
// Utiliy method to create country list.
 public List createCountryList()
 {
  Country indiaCountry=new Country(1, "India");
  Country chinaCountry=new Country(4, "China");
  Country nepalCountry=new Country(3, "Nepal");
  Country bhutanCountry=new Country(2, "Bhutan");
 
  List listOfCountries = new ArrayList();
  listOfCountries.add(indiaCountry);
  listOfCountries.add(chinaCountry);
  listOfCountries.add(nepalCountry);
  listOfCountries.add(bhutanCountry);
  return listOfCountries;
 }
}