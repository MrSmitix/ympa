# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.ShipmentDto do
  @moduledoc """
  Информация об отгрузке.
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :planIntervalFrom,
    :planIntervalTo,
    :shipmentType,
    :warehouse,
    :warehouseTo,
    :externalId,
    :deliveryService,
    :palletsCount,
    :orderIds,
    :draftCount,
    :plannedCount,
    :factCount,
    :currentStatus,
    :availableActions
  ]

  @type t :: %__MODULE__{
    :id => integer() | nil,
    :planIntervalFrom => DateTime.t | nil,
    :planIntervalTo => DateTime.t | nil,
    :shipmentType => ПартнерскийAPIМаркета.Model.ShipmentType.t | nil,
    :warehouse => ПартнерскийAPIМаркета.Model.PartnerShipmentWarehouseDto.t | nil,
    :warehouseTo => ПартнерскийAPIМаркета.Model.PartnerShipmentWarehouseDto.t | nil,
    :externalId => String.t | nil,
    :deliveryService => ПартнерскийAPIМаркета.Model.DeliveryServiceDto.t | nil,
    :palletsCount => ПартнерскийAPIМаркета.Model.PalletsCountDto.t | nil,
    :orderIds => [integer()],
    :draftCount => integer() | nil,
    :plannedCount => integer() | nil,
    :factCount => integer() | nil,
    :currentStatus => ПартнерскийAPIМаркета.Model.ShipmentStatusChangeDto.t | nil,
    :availableActions => [ПартнерскийAPIМаркета.Model.ShipmentActionType.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:planIntervalFrom, :datetime, nil)
     |> Deserializer.deserialize(:planIntervalTo, :datetime, nil)
     |> Deserializer.deserialize(:shipmentType, :struct, ПартнерскийAPIМаркета.Model.ShipmentType)
     |> Deserializer.deserialize(:warehouse, :struct, ПартнерскийAPIМаркета.Model.PartnerShipmentWarehouseDto)
     |> Deserializer.deserialize(:warehouseTo, :struct, ПартнерскийAPIМаркета.Model.PartnerShipmentWarehouseDto)
     |> Deserializer.deserialize(:deliveryService, :struct, ПартнерскийAPIМаркета.Model.DeliveryServiceDto)
     |> Deserializer.deserialize(:palletsCount, :struct, ПартнерскийAPIМаркета.Model.PalletsCountDto)
     |> Deserializer.deserialize(:currentStatus, :struct, ПартнерскийAPIМаркета.Model.ShipmentStatusChangeDto)
     |> Deserializer.deserialize(:availableActions, :list, ПартнерскийAPIМаркета.Model.ShipmentActionType)
  end
end

