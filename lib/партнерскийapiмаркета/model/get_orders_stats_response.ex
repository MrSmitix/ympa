# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetOrdersStatsResponse do
  @moduledoc """
  Ответ на запрос информации по заказам.
  """

  @derive Jason.Encoder
  defstruct [
    :status,
    :result
  ]

  @type t :: %__MODULE__{
    :status => ПартнерскийAPIМаркета.Model.ApiResponseStatusType.t | nil,
    :result => ПартнерскийAPIМаркета.Model.OrdersStatsDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:status, :struct, ПартнерскийAPIМаркета.Model.ApiResponseStatusType)
     |> Deserializer.deserialize(:result, :struct, ПартнерскийAPIМаркета.Model.OrdersStatsDto)
  end
end

