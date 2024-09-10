# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetWarehouseStocksRequest do
  @moduledoc """
  Фильтры для запроса остатков. 
  """

  @derive Jason.Encoder
  defstruct [
    :withTurnover,
    :archived,
    :offerIds
  ]

  @type t :: %__MODULE__{
    :withTurnover => boolean() | nil,
    :archived => boolean() | nil,
    :offerIds => [String.t] | nil
  }

  def decode(value) do
    value
  end
end

