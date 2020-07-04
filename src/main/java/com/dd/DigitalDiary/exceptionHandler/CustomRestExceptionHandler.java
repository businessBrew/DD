package com.dd.DigitalDiary.exceptionHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
/*import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/*import com.genpact.sctt.util.common.constant.SCCTCommonConstant;
import com.genpact.sctt.util.security.util.GlobalSCTTException;
import com.genpact.sctt.util.security.util.ValidationException;
import com.genpact.sctt.util.user.error.UserAlreadyExistException;*/

import com.dd.DigitalDiary.constant.DDCommonConstant;
import com.dd.DigitalDiary.util.UserAlreadyExistException;

public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(CustomRestExceptionHandler.class);

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex,
			final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
		logger.info(ex.getClass().getName());
		final List<String> errors = new ArrayList<String>();
		for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
			errors.add(error.getField() + ": " + error.getDefaultMessage());
		}
		for (final ObjectError error : ex.getBindingResult().getGlobalErrors()) {
			errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
		}
		final ApiError apiError = new ApiError(HttpServletResponse.SC_BAD_REQUEST, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleBindException(final BindException ex, final HttpHeaders headers,
			final HttpStatus status, final WebRequest request) {
		logger.info(ex.getClass().getName());
		final List<String> errors = new ArrayList<String>();
		for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
			errors.add(error.getField() + ": " + error.getDefaultMessage());
		}
		for (final ObjectError error : ex.getBindingResult().getGlobalErrors()) {
			errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
		}
		final ApiError apiError = new ApiError(HttpServletResponse.SC_BAD_REQUEST, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(final TypeMismatchException ex, final HttpHeaders headers,
			final HttpStatus status, final WebRequest request) {
		logger.info(ex.getClass().getName());
		final String error = ex.getValue() + " value for " + ex.getPropertyName() + " should be of type "
				+ ex.getRequiredType();

		final ApiError apiError = new ApiError(HttpServletResponse.SC_BAD_REQUEST, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestPart(final MissingServletRequestPartException ex,
			final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
		logger.info(ex.getClass().getName());
		final String error = ex.getRequestPartName() + " part is missing";
		final ApiError apiError = new ApiError(HttpServletResponse.SC_BAD_REQUEST, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(
			final MissingServletRequestParameterException ex, final HttpHeaders headers, final HttpStatus status,
			final WebRequest request) {
		logger.info(ex.getClass().getName());
		final String error = ex.getParameterName() + " parameter is missing";
		final ApiError apiError = new ApiError(HttpServletResponse.SC_BAD_REQUEST, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ MethodArgumentTypeMismatchException.class })
	public ResponseEntity<Object> handleMethodArgumentTypeMismatch(final MethodArgumentTypeMismatchException ex,
			final WebRequest request) {
		logger.info(ex.getClass().getName());
		final String error = ex.getName() + " should be of type " + ex.getRequiredType().getName();

		final ApiError apiError = new ApiError(HttpServletResponse.SC_BAD_REQUEST, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}

	/*
	 * @ExceptionHandler({ ConstraintViolationException.class }) public
	 * ResponseEntity<Object> handleConstraintViolation(final
	 * ConstraintViolationException ex,final WebRequest request) {
	 * logger.info(ex.getClass().getName()); final List<String> errors = new
	 * ArrayList<String>(); for (final ConstraintViolation<?> violation :
	 * ex.getConstraintViolations()) {
	 * errors.add(violation.getRootBeanClass().getName() + " " +
	 * violation.getPropertyPath() + ": "+ violation.getMessage()); }
	 * 
	 * final ApiError apiError = new ApiError(HttpServletResponse.SC_BAD_REQUEST,
	 * ex.getLocalizedMessage()); return new ResponseEntity<Object>(apiError,
	 * HttpStatus.BAD_REQUEST); }
	 */
	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(final NoHandlerFoundException ex,
			final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
		logger.info(ex.getClass().getName());

		final String error = "No handler found for " + ex.getHttpMethod() + " " + ex.getRequestURL();

		final ApiError apiError = new ApiError(HttpServletResponse.SC_NOT_FOUND, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
			final HttpRequestMethodNotSupportedException ex, final HttpHeaders headers, final HttpStatus status,
			final WebRequest request) {
		logger.info(ex.getClass().getName());
		final StringBuilder builder = new StringBuilder();
		builder.append(ex.getMethod());
		builder.append(" method is not supported for this request. Supported methods are ");
		ex.getSupportedHttpMethods().forEach(t -> builder.append(t + " "));

		final ApiError apiError = new ApiError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.METHOD_NOT_ALLOWED);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(final HttpMediaTypeNotSupportedException ex,
			final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
		logger.info(ex.getClass().getName());
		final StringBuilder builder = new StringBuilder();
		builder.append(ex.getContentType());
		builder.append(" media type is not supported. Supported media types are ");
		ex.getSupportedMediaTypes().forEach(t -> builder.append(t + " "));

		final ApiError apiError = new ApiError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
	}
	
	@ResponseBody
	@ExceptionHandler({UserAlreadyExistException.class })
	public ResponseEntity<Object> handleUserAlreadyExist(final UserAlreadyExistException ex, final WebRequest request) {
		logger.info("409 Status Code", ex);
		final ApiError apiError = new ApiError(HttpServletResponse.SC_CONFLICT, ex.getLocalizedMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.CONFLICT);
	}
	 

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAll(final Exception ex, final WebRequest request) {
		logger.info(ex.getClass().getName());
		logger.error("error", ex);
		final ApiError apiError = new ApiError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
				DDCommonConstant.NO_DATA_FOUND);
		return ResponseEntity.status(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).headers(new HttpHeaders())
				.body(apiError);
	}

	@ExceptionHandler({ NullPointerException.class })
	public ResponseEntity<Object> handleNullPointerException(final Exception ex, final WebRequest request) {
		logger.info(ex.getClass().getName());
		logger.error("error", ex);
		final ApiError apiError = new ApiError(DDCommonConstant.NULL_POINTER_ERROR_CODE,
				DDCommonConstant.NULL_POINTER_EXCEPTION);
		return new ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ DataAccessException.class })
	public ResponseEntity<Object> handleDataAccessException(final Exception ex, final WebRequest request) {
		logger.info(ex.getClass().getName());
		logger.error("error", ex);
		System.out.println("ex.getCause().toString()*****************  " + ex.getCause().toString());
		final ApiError apiError = new ApiError(DDCommonConstant.DATA_ACCESSS_CODE,
				DDCommonConstant.DATA_ACCESSS_EXCEPTION);
		return ResponseEntity.status(HttpServletResponse.SC_NOT_FOUND).headers(new HttpHeaders()).body(apiError);
	}

	@ExceptionHandler({ SQLException.class })
	public ResponseEntity<Object> handleSQLException(final Exception ex, final WebRequest request) {
		logger.info(ex.getClass().getName());
		logger.error("error", ex);
		System.out.println("ex.getCause().toString()" + ex.getCause().toString());
		final ApiError apiError = new ApiError(DDCommonConstant.SQL_CODE, DDCommonConstant.SQL_EXCEPTION);
		return ResponseEntity.status(HttpServletResponse.SC_NOT_FOUND).headers(new HttpHeaders()).body(apiError);
	}

	/*
	 * @ExceptionHandler({ GlobalSCTTException.class }) public
	 * ResponseEntity<Object> handleBIException(final GlobalSCTTException ex, final
	 * WebRequest request) { logger.info(ex.getClass().getName());
	 * logger.error("error", ex); final ApiError apiError = new
	 * ApiError(Integer.valueOf(ex.getStatusCode()),ex.getErrorMessage()); return
	 * ResponseEntity.status(Integer.valueOf(ex.getStatusCode())).headers(new
	 * HttpHeaders()).body(apiError);     }
	 * 
	 * @ExceptionHandler({ ValidationException.class }) public
	 * ResponseEntity<Object> handleValidationException(final ValidationException
	 * ex, final WebRequest request) { logger.info(ex.getClass().getName());
	 * logger.error("error", ex); final ApiError apiError = new
	 * ApiError(ex.getStatusCode(),ex.getErrorMessage()); return
	 * ResponseEntity.status(Integer.valueOf(ex.getStatusCode())).headers(new
	 * HttpHeaders()).body(apiError); //        return new
	 * ResponseEntity<Object>(apiError, HttpStatus.BAD_REQUEST);     }
	 */
	@ExceptionHandler({ EmptyResultDataAccessException.class })
	public ResponseEntity<Object> handleEmptyResultSetException(EmptyResultDataAccessException ex,
			final WebRequest request) {
		logger.info(ex.getClass().getName());
		logger.error("error", ex);
		final ApiError apiError = new ApiError(Integer.valueOf(HttpStatus.NOT_FOUND.toString()), ex.getMessage());
		return new ResponseEntity<Object>(apiError, HttpStatus.NOT_FOUND);
	}

}
