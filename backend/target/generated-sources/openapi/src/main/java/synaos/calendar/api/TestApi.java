/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package synaos.calendar.api;

import synaos.calendar.dtos.BaseCalendarDto;
import synaos.calendar.dtos.CalendarDto;
import synaos.calendar.dtos.ErrorData;
import synaos.calendar.dtos.TotalCalendarDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-04T00:24:03.026534800+02:00[Europe/Berlin]")
@Validated
@Api(value = "test", description = "the test API")
public interface TestApi {

    /**
     * POST /test/calendar
     * create a new Calendar
     *
     * @param baseCalendarDto  (required)
     * @return New Calendar created and returned successfully (status code 201)
     *         or Invalid request (status code 400)
     *         or A server error occurred (status code 500)
     */
    @ApiOperation(value = "", nickname = "createCalendar", notes = "create a new Calendar", response = CalendarDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "New Calendar created and returned successfully", response = CalendarDto.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorData.class),
        @ApiResponse(code = 500, message = "A server error occurred", response = ErrorData.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/test/calendar",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CalendarDto> createCalendar(@ApiParam(value = "", required = true) @Valid @RequestBody BaseCalendarDto baseCalendarDto);


    /**
     * DELETE /test/calendar/{calendarId}
     * Delete a Calendar
     *
     * @param calendarId The Calendar id (required)
     * @return Deletion request was successfully executed (status code 204)
     *         or Invalid request (status code 400)
     *         or A server error occurred (status code 500)
     */
    @ApiOperation(value = "", nickname = "deleteCalendarById", notes = "Delete a Calendar", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deletion request was successfully executed"),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorData.class),
        @ApiResponse(code = 500, message = "A server error occurred", response = ErrorData.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/test/calendar/{calendarId}",
        produces = { "application/json" }
    )
    ResponseEntity<Void> deleteCalendarById(@ApiParam(value = "The Calendar id", required = true) @PathVariable("calendarId") Integer calendarId);


    /**
     * GET /test/calendar
     * Returns all Calendar with their data
     *
     * @param date  (optional)
     * @return All Calendar data for the queried date returned successfully (status code 200)
     *         or A server error occurred (status code 500)
     */
    @ApiOperation(value = "", nickname = "getCalendar", notes = "Returns all Calendar with their data", response = TotalCalendarDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "All Calendar data for the queried date returned successfully", response = TotalCalendarDto.class),
        @ApiResponse(code = 500, message = "A server error occurred", response = ErrorData.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/test/calendar",
        produces = { "application/json" }
    )
    ResponseEntity<TotalCalendarDto> getCalendar(@ApiParam(value = "") @Valid @RequestParam(value = "date", required = false) String date);


    /**
     * PUT /test/calendar/{calendarId}
     * Modify a Calendar
     *
     * @param calendarId The Calendar id (required)
     * @param baseCalendarDto  (required)
     * @return Calendar modified and returned successfully (status code 200)
     *         or Invalid request (status code 400)
     *         or A server error occurred (status code 500)
     */
    @ApiOperation(value = "", nickname = "updateCalendarById", notes = "Modify a Calendar", response = CalendarDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Calendar modified and returned successfully", response = CalendarDto.class),
        @ApiResponse(code = 400, message = "Invalid request", response = ErrorData.class),
        @ApiResponse(code = 500, message = "A server error occurred", response = ErrorData.class) })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/test/calendar/{calendarId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CalendarDto> updateCalendarById(@ApiParam(value = "The Calendar id", required = true) @PathVariable("calendarId") Integer calendarId,@ApiParam(value = "", required = true) @Valid @RequestBody BaseCalendarDto baseCalendarDto);

}
