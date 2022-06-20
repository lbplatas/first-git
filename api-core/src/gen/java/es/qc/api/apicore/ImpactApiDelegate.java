package es.qc.api.apicore;

import es.qc.api.apicore.model.Error;
import es.qc.api.apicore.model.InvestmentImpactRequest;
import es.qc.api.apicore.model.InvestmentImpactResponse;
import es.qc.api.apicore.model.SavingsImpactResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link ImpactApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public interface ImpactApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /impact/balancebased/savings
     * Get the impact the customer makes by having &#x60;&#x60;amount&#x60;&#x60; of euros in their savings account
     *
     * @param amount The amount in the savings account in euros (required)
     * @return Impact of having &#x60;&#x60;amount&#x60;&#x60; of euros in a savings account (status code 200)
     *         or Error response (status code 200)
     * @see ImpactApi#getSavingsImpact
     */
    default ResponseEntity<SavingsImpactResponse> getSavingsImpact(Double amount) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tiles\" : [ { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } }, { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } } ], \"dataSource\" : \"dataSource\", \"impactMetrics\" : [ { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" }, { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /impact/balancebased/funds
     * Provide list of funds and accompanying shares for which to fetch impact data for the customer
     *
     * @param investmentImpactRequest  (required)
     * @return Sum of the impact of investing numberOfShares shares per fund in the given funds (status code 200)
     *         or Error response (status code 200)
     * @see ImpactApi#postInvestmentImpact
     */
    default ResponseEntity<InvestmentImpactResponse> postInvestmentImpact(InvestmentImpactRequest investmentImpactRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"impactAggregate\" : { \"tiles\" : [ { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } }, { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } } ], \"sdgs\" : { \"explanationLinkUrl\" : \"explanationLinkUrl\", \"items\" : [ 10, 10 ] }, \"fundInfo\" : { \"fundID\" : \"fundID\", \"fundName\" : \"fundName\" }, \"impactMetrics\" : [ { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" }, { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" } ], \"sustainableDevelopmentGoals\" : [ 3, 3 ] }, \"impactPerFund\" : [ { \"tiles\" : [ { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } }, { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } } ], \"sdgs\" : { \"explanationLinkUrl\" : \"explanationLinkUrl\", \"items\" : [ 10, 10 ] }, \"fundInfo\" : { \"fundID\" : \"fundID\", \"fundName\" : \"fundName\" }, \"impactMetrics\" : [ { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" }, { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" } ], \"sustainableDevelopmentGoals\" : [ 3, 3 ] }, { \"tiles\" : [ { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } }, { \"templateID\" : \"METRIC_WORDING_WITHOUT_EQUIVALENCE\", \"content\" : { \"measurementEquivalence\" : \"measurementEquivalence\", \"measurementDescription\" : \"measurementDescription\", \"measurementIcon\" : { \"pdf\" : \"pdf\", \"svg\" : \"svg\", \"png\" : \"png\" }, \"measurement\" : \"measurement\" } } ], \"sdgs\" : { \"explanationLinkUrl\" : \"explanationLinkUrl\", \"items\" : [ 10, 10 ] }, \"fundInfo\" : { \"fundID\" : \"fundID\", \"fundName\" : \"fundName\" }, \"impactMetrics\" : [ { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" }, { \"equivalenceValue\" : 6.027456183070403, \"unit\" : \"KG\", \"metric\" : \"CO2\", \"value\" : 0.8008281904610115, \"equivalenceUnit\" : \"BAGS\" } ], \"sustainableDevelopmentGoals\" : [ 3, 3 ] } ], \"dataSource\" : \"dataSource\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
