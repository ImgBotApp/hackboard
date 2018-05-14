/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.refugeescode.hackboard.web.api.controller;

import io.refugeescode.hackboard.service.dto.CompetencyDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(value = "competency", description = "the competency API")
public interface CompetencyApi {

    Logger log = LoggerFactory.getLogger(CompetencyApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Add a new competency", nickname = "addCompetency", notes = "", response = Boolean.class, tags={ "competency", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Boolean.class) })
    @RequestMapping(value = "/competency",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Boolean> addCompetency(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CompetencyDto competency) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CompetencyApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Edit competency", nickname = "editCompetency", notes = "", response = Boolean.class, tags={ "competency", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Boolean.class) })
    @RequestMapping(value = "/competency",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Boolean> editCompetency(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CompetencyDto competency) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CompetencyApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "List all competency", nickname = "listCompetency", notes = "", response = CompetencyDto.class, responseContainer = "List", tags={ "competency", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CompetencyDto.class, responseContainer = "List") })
    @RequestMapping(value = "/competency",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<CompetencyDto>> listCompetency() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"id\" : 0,  \"title\" : \"title\"}, {  \"id\" : 0,  \"title\" : \"title\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CompetencyApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
