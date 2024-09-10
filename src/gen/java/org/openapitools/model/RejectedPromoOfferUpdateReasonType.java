package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum RejectedPromoOfferUpdateReasonType {
  OFFER_DOES_NOT_EXIST,
  OFFER_DUPLICATION,
  OFFER_NOT_ELIGIBLE_FOR_PROMO,
  OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED,
  DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED,
  EMPTY_OLD_PRICE,
  EMPTY_PROMO_PRICE,
  MAX_PROMO_PRICE_EXCEEDED,
  PROMO_PRICE_BIGGER_THAN_MAX,
  PROMO_PRICE_SMALLER_THAN_MIN;
}
