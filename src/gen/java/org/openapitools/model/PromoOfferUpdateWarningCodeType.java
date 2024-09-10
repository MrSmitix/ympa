package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum PromoOfferUpdateWarningCodeType {
    DEEP_DISCOUNT_OFFER, CATALOG_PRICE_IS_LOWER_THAN_PROMO, SHOP_PRICES_ARE_LOWER_THAN_PROMO, PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE, SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO
}
