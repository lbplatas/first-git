/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package es.qc.api.apicore;

import es.qc.api.apicore.model.Error;
import es.qc.api.apicore.model.InvestmentImpactRequest;
import es.qc.api.apicore.model.InvestmentImpactResponse;
import es.qc.api.apicore.model.SavingsImpactResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
@Validated
@Tag(name = "impact", description = "the impact API")
public interface ImpactApi {

    default ImpactApiDelegate getDelegate() {
        return new ImpactApiDelegate() {};
    }

    /**
     * GET /impact/balancebased/savings
     * Get the impact the customer makes by having &#x60;&#x60;amount&#x60;&#x60; of euros in their savings account
     *
     * @param amount The amount in the savings account in euros (required)
     * @return Impact of having &#x60;&#x60;amount&#x60;&#x60; of euros in a savings account (status code 200)
     *         or Error response (status code 200)
     */
    @Operation(
        operationId = "getSavingsImpact",
        tags = { "impact" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Impact of having ``amount`` of euros in a savings account", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  SavingsImpactResponse.class))),
            @ApiResponse(responseCode = "200", description = "Error response", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/impact/balancebased/savings",
        produces = { "application/json" }
    )
    default ResponseEntity<SavingsImpactResponse> getSavingsImpact(
        @NotNull @Parameter(name = "amount", description = "The amount in the savings account in euros", required = true, schema = @Schema(description = "")) @Valid @RequestParam(value = "amount", required = true) Double amount
    ) {
        return getDelegate().getSavingsImpact(amount);
    }


    /**
     * POST /impact/balancebased/funds
     * Provide list of funds and accompanying shares for which to fetch impact data for the customer
     *
     * @param investmentImpactRequest  (required)
     * @return Sum of the impact of investing numberOfShares shares per fund in the given funds (status code 200)
     *         or Error response (status code 200)
     */
    @Operation(
        operationId = "postInvestmentImpact",
        tags = { "impact" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Sum of the impact of investing numberOfShares shares per fund in the given funds", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  InvestmentImpactResponse.class))),
            @ApiResponse(responseCode = "200", description = "Error response", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/impact/balancebased/funds",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InvestmentImpactResponse> postInvestmentImpact(
        @Parameter(name = "InvestmentImpactRequest", description = "", required = true, schema = @Schema(description = "")) @Valid @RequestBody InvestmentImpactRequest investmentImpactRequest
    ) {
        return getDelegate().postInvestmentImpact(investmentImpactRequest);
    }

}