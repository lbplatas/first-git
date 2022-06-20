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
 * Basic information of a fund
 */

@Schema(name = "FundInfo", description = "Basic information of a fund")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class FundInfo   {

  @JsonProperty("fundID")
  private String fundID;

  @JsonProperty("fundName")
  private String fundName;

  public FundInfo fundID(String fundID) {
    this.fundID = fundID;
    return this;
  }

  /**
   * Identifier of the fund
   * @return fundID
  */
  
  @Schema(name = "fundID", description = "Identifier of the fund", required = false)
  public String getFundID() {
    return fundID;
  }

  public void setFundID(String fundID) {
    this.fundID = fundID;
  }

  public FundInfo fundName(String fundName) {
    this.fundName = fundName;
    return this;
  }

  /**
   * Full name of the fund
   * @return fundName
  */
  
  @Schema(name = "fundName", description = "Full name of the fund", required = false)
  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundInfo fundInfo = (FundInfo) o;
    return Objects.equals(this.fundID, fundInfo.fundID) &&
        Objects.equals(this.fundName, fundInfo.fundName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundID, fundName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundInfo {\n");
    sb.append("    fundID: ").append(toIndentedString(fundID)).append("\n");
    sb.append("    fundName: ").append(toIndentedString(fundName)).append("\n");
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

