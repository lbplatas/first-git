package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A single fund with the number of shares owned
 */

@Schema(name = "FundWithShares", description = "A single fund with the number of shares owned")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class FundWithShares   {

  @JsonProperty("fundID")
  private String fundID;

  @JsonProperty("numberOfShares")
  private Double numberOfShares;

  public FundWithShares fundID(String fundID) {
    this.fundID = fundID;
    return this;
  }

  /**
   * Fund identifier
   * @return fundID
  */
  @Size(min = 1) 
  @Schema(name = "fundID", description = "Fund identifier", required = false)
  public String getFundID() {
    return fundID;
  }

  public void setFundID(String fundID) {
    this.fundID = fundID;
  }

  public FundWithShares numberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
    return this;
  }

  /**
   * The number of shares the customer holds of the fund with id ``fundID``.
   * minimum: 0
   * @return numberOfShares
  */
  @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "numberOfShares", description = "The number of shares the customer holds of the fund with id ``fundID``.", required = false)
  public Double getNumberOfShares() {
    return numberOfShares;
  }

  public void setNumberOfShares(Double numberOfShares) {
    this.numberOfShares = numberOfShares;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundWithShares fundWithShares = (FundWithShares) o;
    return Objects.equals(this.fundID, fundWithShares.fundID) &&
        Objects.equals(this.numberOfShares, fundWithShares.numberOfShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundID, numberOfShares);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundWithShares {\n");
    sb.append("    fundID: ").append(toIndentedString(fundID)).append("\n");
    sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
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

