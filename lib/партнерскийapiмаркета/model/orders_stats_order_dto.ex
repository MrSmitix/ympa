# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OrdersStatsOrderDto do
  @moduledoc """
  Информация о заказе.
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :creationDate,
    :statusUpdateDate,
    :status,
    :partnerOrderId,
    :paymentType,
    :fake,
    :deliveryRegion,
    :items,
    :initialItems,
    :payments,
    :commissions
  ]

  @type t :: %__MODULE__{
    :id => integer() | nil,
    :creationDate => Date.t | nil,
    :statusUpdateDate => DateTime.t | nil,
    :status => ПартнерскийAPIМаркета.Model.OrderStatsStatusType.t | nil,
    :partnerOrderId => String.t | nil,
    :paymentType => ПартнерскийAPIМаркета.Model.OrdersStatsOrderPaymentType.t | nil,
    :fake => boolean() | nil,
    :deliveryRegion => ПартнерскийAPIМаркета.Model.OrdersStatsDeliveryRegionDto.t | nil,
    :items => [ПартнерскийAPIМаркета.Model.OrdersStatsItemDto.t],
    :initialItems => [ПартнерскийAPIМаркета.Model.OrdersStatsItemDto.t] | nil,
    :payments => [ПартнерскийAPIМаркета.Model.OrdersStatsPaymentDto.t],
    :commissions => [ПартнерскийAPIМаркета.Model.OrdersStatsCommissionDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:creationDate, :date, nil)
     |> Deserializer.deserialize(:statusUpdateDate, :datetime, nil)
     |> Deserializer.deserialize(:status, :struct, ПартнерскийAPIМаркета.Model.OrderStatsStatusType)
     |> Deserializer.deserialize(:paymentType, :struct, ПартнерскийAPIМаркета.Model.OrdersStatsOrderPaymentType)
     |> Deserializer.deserialize(:deliveryRegion, :struct, ПартнерскийAPIМаркета.Model.OrdersStatsDeliveryRegionDto)
     |> Deserializer.deserialize(:items, :list, ПартнерскийAPIМаркета.Model.OrdersStatsItemDto)
     |> Deserializer.deserialize(:initialItems, :list, ПартнерскийAPIМаркета.Model.OrdersStatsItemDto)
     |> Deserializer.deserialize(:payments, :list, ПартнерскийAPIМаркета.Model.OrdersStatsPaymentDto)
     |> Deserializer.deserialize(:commissions, :list, ПартнерскийAPIМаркета.Model.OrdersStatsCommissionDto)
  end
end

