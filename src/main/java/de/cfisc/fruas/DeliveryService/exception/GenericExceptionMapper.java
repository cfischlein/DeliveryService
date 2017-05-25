package de.cfisc.fruas.DeliveryService.exception;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;




import de.cfisc.fruas.DeliveryService.model.ErrorMessage;




public class GenericExceptionMapper implements ExceptionMapper<Throwable> { //throwable: catch all exceptions

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 500, "http://localhost:8080/DeliveryService");
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.type(MediaType.APPLICATION_JSON)
				.entity(errorMessage)				
				.build();
	}


	

}