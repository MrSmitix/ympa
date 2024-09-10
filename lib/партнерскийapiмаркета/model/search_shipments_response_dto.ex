# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.SearchShipmentsResponseDto do
  @moduledoc """
  Информация об отгрузках.
  """

  @derive Jason.Encoder
  defstruct [
    :shipments,
    :paging
  ]

  @type t :: %__MODULE__{
    :shipments => [ПартнерскийAPIМаркета.Model.ShipmentInfoDto.t],
    :paging => ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:shipments, :list, ПартнерскийAPIМаркета.Model.ShipmentInfoDto)
     |> Deserializer.deserialize(:paging, :struct, ПартнерскийAPIМаркета.Model.ForwardScrollingPagerDto)
  end
end

