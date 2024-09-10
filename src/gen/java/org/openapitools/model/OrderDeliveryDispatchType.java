package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OrderDeliveryDispatchType {
  UNKNOWN,
  BUYER,
  MARKET_PARTNER_OUTLET,
  MARKET_BRANDED_OUTLET,
  SHOP_OUTLET,
  DROPOFF;
}
