# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.UpdatePromoOfferParamsDto do
  @moduledoc """
  Параметры товара, который участвует в акции.
  """

  @derive Jason.Encoder
  defstruct [
    :discountParams
  ]

  @type t :: %__MODULE__{
    :discountParams => ПартнерскийAPIМаркета.Model.UpdatePromoOfferDiscountParamsDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:discountParams, :struct, ПартнерскийAPIМаркета.Model.UpdatePromoOfferDiscountParamsDto)
  end
end

