package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OfferCampaignStatusType {
  PUBLISHED,
  CHECKING,
  DISABLED_BY_PARTNER,
  DISABLED_AUTOMATICALLY,
  REJECTED_BY_MARKET,
  CREATING_CARD,
  NO_CARD,
  NO_STOCKS,
  ARCHIVED;
}
