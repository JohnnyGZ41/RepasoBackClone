package com.acme.center.platform.sales.interfaces.resources;


public record CustomerRequestResponse(
   Long id,
   String name,
   String email,
   String dni
) {


}
