package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum OfferType {
  DEFAULT,
  MEDICINE,
  BOOK,
  AUDIOBOOK,
  ARTIST_TITLE,
  ON_DEMAND;
}
