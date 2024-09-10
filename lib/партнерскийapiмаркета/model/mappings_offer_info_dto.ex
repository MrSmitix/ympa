# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.MappingsOfferInfoDto do
  @moduledoc """
  Базовая информация о товарах в каталоге.
  """

  @derive Jason.Encoder
  defstruct [
    :name,
    :shopSku,
    :category,
    :vendor,
    :vendorCode,
    :description,
    :id,
    :feedId,
    :barcodes,
    :urls,
    :pictures,
    :manufacturer,
    :manufacturerCountries,
    :minShipment,
    :transportUnitSize,
    :quantumOfSupply,
    :deliveryDurationDays,
    :boxCount,
    :customsCommodityCodes,
    :weightDimensions,
    :supplyScheduleDays,
    :shelfLifeDays,
    :lifeTimeDays,
    :guaranteePeriodDays,
    :processingState,
    :availability,
    :shelfLife,
    :lifeTime,
    :guaranteePeriod,
    :certificate
  ]

  @type t :: %__MODULE__{
    :name => String.t | nil,
    :shopSku => String.t | nil,
    :category => String.t | nil,
    :vendor => String.t | nil,
    :vendorCode => String.t | nil,
    :description => String.t | nil,
    :id => String.t | nil,
    :feedId => integer() | nil,
    :barcodes => [String.t] | nil,
    :urls => [String.t] | nil,
    :pictures => [String.t] | nil,
    :manufacturer => String.t | nil,
    :manufacturerCountries => [String.t] | nil,
    :minShipment => integer() | nil,
    :transportUnitSize => integer() | nil,
    :quantumOfSupply => integer() | nil,
    :deliveryDurationDays => integer() | nil,
    :boxCount => integer() | nil,
    :customsCommodityCodes => [String.t] | nil,
    :weightDimensions => ПартнерскийAPIМаркета.Model.OfferWeightDimensionsDto.t | nil,
    :supplyScheduleDays => [ПартнерскийAPIМаркета.Model.DayOfWeekType.t] | nil,
    :shelfLifeDays => integer() | nil,
    :lifeTimeDays => integer() | nil,
    :guaranteePeriodDays => integer() | nil,
    :processingState => ПартнерскийAPIМаркета.Model.OfferProcessingStateDto.t | nil,
    :availability => ПартнерскийAPIМаркета.Model.OfferAvailabilityStatusType.t | nil,
    :shelfLife => ПартнерскийAPIМаркета.Model.TimePeriodDto.t | nil,
    :lifeTime => ПартнерскийAPIМаркета.Model.TimePeriodDto.t | nil,
    :guaranteePeriod => ПартнерскийAPIМаркета.Model.TimePeriodDto.t | nil,
    :certificate => String.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:weightDimensions, :struct, ПартнерскийAPIМаркета.Model.OfferWeightDimensionsDto)
     |> Deserializer.deserialize(:supplyScheduleDays, :list, ПартнерскийAPIМаркета.Model.DayOfWeekType)
     |> Deserializer.deserialize(:processingState, :struct, ПартнерскийAPIМаркета.Model.OfferProcessingStateDto)
     |> Deserializer.deserialize(:availability, :struct, ПартнерскийAPIМаркета.Model.OfferAvailabilityStatusType)
     |> Deserializer.deserialize(:shelfLife, :struct, ПартнерскийAPIМаркета.Model.TimePeriodDto)
     |> Deserializer.deserialize(:lifeTime, :struct, ПартнерскийAPIМаркета.Model.TimePeriodDto)
     |> Deserializer.deserialize(:guaranteePeriod, :struct, ПартнерскийAPIМаркета.Model.TimePeriodDto)
  end
end

