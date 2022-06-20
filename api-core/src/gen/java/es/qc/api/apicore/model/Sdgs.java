package es.qc.api.apicore.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Sustainable development goals data
 */

@Schema(name = "Sdgs", description = "Sustainable development goals data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-16T14:05:38.997555200+02:00[Europe/Madrid]")
public class Sdgs   {

  @JsonProperty("items")
  @Valid
  private List<Integer> items = null;

  @JsonProperty("explanationLinkUrl")
  private String explanationLinkUrl;

  public Sdgs items(List<Integer> items) {
    this.items = items;
    return this;
  }

  public Sdgs addItemsItem(Integer itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of Sustainable Development Goals this fund contributes to.
   * @return items
  */
  
  @Schema(name = "items", description = "List of Sustainable Development Goals this fund contributes to.", required = false)
  public List<Integer> getItems() {
    return items;
  }

  public void setItems(List<Integer> items) {
    this.items = items;
  }

  public Sdgs explanationLinkUrl(String explanationLinkUrl) {
    this.explanationLinkUrl = explanationLinkUrl;
    return this;
  }

  /**
   * Link URL information about sustainable development goals
   * @return explanationLinkUrl
  */
  
  @Schema(name = "explanationLinkUrl", description = "Link URL information about sustainable development goals", required = false)
  public String getExplanationLinkUrl() {
    return explanationLinkUrl;
  }

  public void setExplanationLinkUrl(String explanationLinkUrl) {
    this.explanationLinkUrl = explanationLinkUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sdgs sdgs = (Sdgs) o;
    return Objects.equals(this.items, sdgs.items) &&
        Objects.equals(this.explanationLinkUrl, sdgs.explanationLinkUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, explanationLinkUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sdgs {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    explanationLinkUrl: ").append(toIndentedString(explanationLinkUrl)).append("\n");
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

