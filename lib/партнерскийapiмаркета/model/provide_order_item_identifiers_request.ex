# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.ProvideOrderItemIdentifiersRequest do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :items
  ]

  @type t :: %__MODULE__{
    :items => [ПартнерскийAPIМаркета.Model.OrderItemInstanceModificationDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:items, :list, ПартнерскийAPIМаркета.Model.OrderItemInstanceModificationDto)
  end
end

