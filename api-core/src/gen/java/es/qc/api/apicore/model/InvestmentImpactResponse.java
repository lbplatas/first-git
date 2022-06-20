package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import es.qc.api.apicore.model.ImpactValues;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Impact made by user by investing in a list of funds, given per fund, and as a sum
 */

@Schema(name = "InvestmentImpactResponse", description = "Impact made by user by investing in a list of funds, given per fund, and as a sum")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class InvestmentImpactResponse   {

  @JsonProperty("impactAggregate")
  private ImpactValues impactAggregate;

  @JsonProperty("impactPerFund")
  @Valid
  private List<ImpactValues> impactPerFund = null;

  @JsonProperty("dataSource")
  private String dataSource;

  public InvestmentImpactResponse impactAggregate(ImpactValues impactAggregate) {
    this.impactAggregate = impactAggregate;
    return this;
  }

  /**
   * Get impactAggregate
   * @return impactAggregate
  */
  @Valid 
  @Schema(name = "impactAggregate", required = false)
  public ImpactValues getImpactAggregate() {
    return impactAggregate;
  }

  public void setImpactAggregate(ImpactValues impactAggregate) {
    this.impactAggregate = impactAggregate;
  }

  public InvestmentImpactResponse impactPerFund(List<ImpactValues> impactPerFund) {
    this.impactPerFund = impactPerFund;
    return this;
  }

  public InvestmentImpactResponse addImpactPerFundItem(ImpactValues impactPerFundItem) {
    if (this.impactPerFund == null) {
      this.impactPerFund = new ArrayList<>();
    }
    this.impactPerFund.add(impactPerFundItem);
    return this;
  }

  /**
   * List of impact per fund
   * @return impactPerFund
  */
  @Valid 
  @Schema(name = "impactPerFund", description = "List of impact per fund", required = false)
  public List<ImpactValues> getImpactPerFund() {
    return impactPerFund;
  }

  public void setImpactPerFund(List<ImpactValues> impactPerFund) {
    this.impactPerFund = impactPerFund;
  }

  public InvestmentImpactResponse dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * Describes the data source used to obtain this data
   * @return dataSource
  */
  
  @Schema(name = "dataSource", description = "Describes the data source used to obtain this data", required = false)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentImpactResponse investmentImpactResponse = (InvestmentImpactResponse) o;
    return Objects.equals(this.impactAggregate, investmentImpactResponse.impactAggregate) &&
        Objects.equals(this.impactPerFund, investmentImpactResponse.impactPerFund) &&
        Objects.equals(this.dataSource, investmentImpactResponse.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impactAggregate, impactPerFund, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentImpactResponse {\n");
    sb.append("    impactAggregate: ").append(toIndentedString(impactAggregate)).append("\n");
    sb.append("    impactPerFund: ").append(toIndentedString(impactPerFund)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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

