# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.TransferOrdersFromShipmentRequest do
  @moduledoc """
  Запрос переноса заказов из отгрузки.
  """

  @derive Jason.Encoder
  defstruct [
    :orderIds
  ]

  @type t :: %__MODULE__{
    :orderIds => [integer()]
  }

  def decode(value) do
    value
  end
end

