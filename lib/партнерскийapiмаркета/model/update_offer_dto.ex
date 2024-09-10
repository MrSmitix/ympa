# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.UpdateOfferDto do
  @moduledoc """
  Параметры товара.
  """

  @derive Jason.Encoder
  defstruct [
    :offerId,
    :name,
    :marketCategoryId,
    :category,
    :pictures,
    :videos,
    :manuals,
    :vendor,
    :barcodes,
    :description,
    :manufacturerCountries,
    :weightDimensions,
    :vendorCode,
    :tags,
    :shelfLife,
    :lifeTime,
    :guaranteePeriod,
    :customsCommodityCode,
    :certificates,
    :boxCount,
    :condition,
    :type,
    :downloadable,
    :adult,
    :age,
    :params,
    :parameterValues,
    :basicPrice,
    :purchasePrice,
    :additionalExpenses,
    :cofinancePrice
  ]

  @type t :: %__MODULE__{
    :offerId => String.t,
    :name => String.t | nil,
    :marketCategoryId => integer() | nil,
    :category => String.t | nil,
    :pictures => [String.t] | nil,
    :videos => [String.t] | nil,
    :manuals => [ПартнерскийAPIМаркета.Model.OfferManualDto.t] | nil,
    :vendor => String.t | nil,
    :barcodes => [String.t] | nil,
    :description => String.t | nil,
    :manufacturerCountries => [String.t] | nil,
    :weightDimensions => ПартнерскийAPIМаркета.Model.OfferWeightDimensionsDto.t | nil,
    :vendorCode => String.t | nil,
    :tags => [String.t] | nil,
    :shelfLife => ПартнерскийAPIМаркета.Model.TimePeriodDto.t | nil,
    :lifeTime => ПартнерскийAPIМаркета.Model.TimePeriodDto.t | nil,
    :guaranteePeriod => ПартнерскийAPIМаркета.Model.TimePeriodDto.t | nil,
    :customsCommodityCode => String.t | nil,
    :certificates => [String.t] | nil,
    :boxCount => integer() | nil,
    :condition => ПартнерскийAPIМаркета.Model.OfferConditionDto.t | nil,
    :type => ПартнерскийAPIМаркета.Model.OfferType.t | nil,
    :downloadable => boolean() | nil,
    :adult => boolean() | nil,
    :age => ПартнерскийAPIМаркета.Model.AgeDto.t | nil,
    :params => [ПартнерскийAPIМаркета.Model.OfferParamDto.t] | nil,
    :parameterValues => [ПартнерскийAPIМаркета.Model.ParameterValueDto.t] | nil,
    :basicPrice => ПартнерскийAPIМаркета.Model.UpdatePriceWithDiscountDto.t | nil,
    :purchasePrice => ПартнерскийAPIМаркета.Model.BasePriceDto.t | nil,
    :additionalExpenses => ПартнерскийAPIМаркета.Model.BasePriceDto.t | nil,
    :cofinancePrice => ПартнерскийAPIМаркета.Model.BasePriceDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:manuals, :list, ПартнерскийAPIМаркета.Model.OfferManualDto)
     |> Deserializer.deserialize(:weightDimensions, :struct, ПартнерскийAPIМаркета.Model.OfferWeightDimensionsDto)
     |> Deserializer.deserialize(:shelfLife, :struct, ПартнерскийAPIМаркета.Model.TimePeriodDto)
     |> Deserializer.deserialize(:lifeTime, :struct, ПартнерскийAPIМаркета.Model.TimePeriodDto)
     |> Deserializer.deserialize(:guaranteePeriod, :struct, ПартнерскийAPIМаркета.Model.TimePeriodDto)
     |> Deserializer.deserialize(:condition, :struct, ПартнерскийAPIМаркета.Model.OfferConditionDto)
     |> Deserializer.deserialize(:type, :struct, ПартнерскийAPIМаркета.Model.OfferType)
     |> Deserializer.deserialize(:age, :struct, ПартнерскийAPIМаркета.Model.AgeDto)
     |> Deserializer.deserialize(:params, :list, ПартнерскийAPIМаркета.Model.OfferParamDto)
     |> Deserializer.deserialize(:parameterValues, :list, ПартнерскийAPIМаркета.Model.ParameterValueDto)
     |> Deserializer.deserialize(:basicPrice, :struct, ПартнерскийAPIМаркета.Model.UpdatePriceWithDiscountDto)
     |> Deserializer.deserialize(:purchasePrice, :struct, ПартнерскийAPIМаркета.Model.BasePriceDto)
     |> Deserializer.deserialize(:additionalExpenses, :struct, ПартнерскийAPIМаркета.Model.BasePriceDto)
     |> Deserializer.deserialize(:cofinancePrice, :struct, ПартнерскийAPIМаркета.Model.BasePriceDto)
  end
end

