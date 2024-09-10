# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OrderItemInstanceModificationDto do
  @moduledoc """
  Позиция в корзине, требующая маркировки.
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :instances
  ]

  @type t :: %__MODULE__{
    :id => integer(),
    :instances => [ПартнерскийAPIМаркета.Model.BriefOrderItemInstanceDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:instances, :list, ПартнерскийAPIМаркета.Model.BriefOrderItemInstanceDto)
  end
end

