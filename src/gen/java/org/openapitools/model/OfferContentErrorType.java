package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OfferContentErrorType {
    OFFER_NOT_FOUND, UNKNOWN_CATEGORY, CATEGORY_MISMATCH, UNKNOWN_PARAMETER, UNEXPECTED_BOOLEAN_VALUE, NUMBER_FORMAT, VALUE_BLANK, INVALID_UNIT_ID, INVALID_GROUP_ID_LENGTH, INVALID_GROUP_ID_CHARACTERS
}
