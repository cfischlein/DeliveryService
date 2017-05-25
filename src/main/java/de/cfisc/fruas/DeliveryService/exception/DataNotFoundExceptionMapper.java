package de.cfisc.fruas.DeliveryService.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import de.cfisc.fruas.DeliveryService.model.ErrorMessage;


@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), 404, "http://localhost:8080/DeliveryService");
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)				
				.build();
	}

	

}
