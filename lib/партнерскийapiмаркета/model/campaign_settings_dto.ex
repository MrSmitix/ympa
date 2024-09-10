# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.CampaignSettingsDto do
  @moduledoc """
  Настройки магазина.
  """

  @derive Jason.Encoder
  defstruct [
    :countryRegion,
    :shopName,
    :showInContext,
    :showInPremium,
    :useOpenStat,
    :localRegion
  ]

  @type t :: %__MODULE__{
    :countryRegion => integer() | nil,
    :shopName => String.t | nil,
    :showInContext => boolean() | nil,
    :showInPremium => boolean() | nil,
    :useOpenStat => boolean() | nil,
    :localRegion => ПартнерскийAPIМаркета.Model.CampaignSettingsLocalRegionDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:localRegion, :struct, ПартнерскийAPIМаркета.Model.CampaignSettingsLocalRegionDto)
  end
end

