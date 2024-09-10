package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OrderVatType {
    NO_VAT, VAT_0, VAT_10, VAT_10_110, VAT_20, VAT_20_120, VAT_18, VAT_18_118, UNKNOWN_VALUE
}
