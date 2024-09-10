# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.WarehouseOfferDto do
  @moduledoc """
  Информация об остатках товара.
  """

  @derive Jason.Encoder
  defstruct [
    :offerId,
    :turnoverSummary,
    :stocks,
    :updatedAt
  ]

  @type t :: %__MODULE__{
    :offerId => String.t,
    :turnoverSummary => ПартнерскийAPIМаркета.Model.TurnoverDto.t | nil,
    :stocks => [ПартнерскийAPIМаркета.Model.WarehouseStockDto.t],
    :updatedAt => DateTime.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:turnoverSummary, :struct, ПартнерскийAPIМаркета.Model.TurnoverDto)
     |> Deserializer.deserialize(:stocks, :list, ПартнерскийAPIМаркета.Model.WarehouseStockDto)
     |> Deserializer.deserialize(:updatedAt, :datetime, nil)
  end
end

