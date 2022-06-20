package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.qc.api.apicore.model.FundWithShares;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List consisting of funds for which the impact is requested along with their number of shares
 */

@Schema(name = "InvestmentImpactRequest", description = "List consisting of funds for which the impact is requested along with their number of shares")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class InvestmentImpactRequest   {

  @JsonProperty("requestedFundsWithShares")
  @Valid
  private List<FundWithShares> requestedFundsWithShares = null;

  public InvestmentImpactRequest requestedFundsWithShares(List<FundWithShares> requestedFundsWithShares) {
    this.requestedFundsWithShares = requestedFundsWithShares;
    return this;
  }

  public InvestmentImpactRequest addRequestedFundsWithSharesItem(FundWithShares requestedFundsWithSharesItem) {
    if (this.requestedFundsWithShares == null) {
      this.requestedFundsWithShares = new ArrayList<>();
    }
    this.requestedFundsWithShares.add(requestedFundsWithSharesItem);
    return this;
  }

  /**
   * List of requested funds and number of shares for each fund
   * @return requestedFundsWithShares
  */
  @Valid 
  @Schema(name = "requestedFundsWithShares", description = "List of requested funds and number of shares for each fund", required = false)
  public List<FundWithShares> getRequestedFundsWithShares() {
    return requestedFundsWithShares;
  }

  public void setRequestedFundsWithShares(List<FundWithShares> requestedFundsWithShares) {
    this.requestedFundsWithShares = requestedFundsWithShares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentImpactRequest investmentImpactRequest = (InvestmentImpactRequest) o;
    return Objects.equals(this.requestedFundsWithShares, investmentImpactRequest.requestedFundsWithShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedFundsWithShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentImpactRequest {\n");
    sb.append("    requestedFundsWithShares: ").append(toIndentedString(requestedFundsWithShares)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

