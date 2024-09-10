# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.CampaignSettingsDeliveryDto do
  @moduledoc """
  Информация о доставке в своем регионе магазина.
  """

  @derive Jason.Encoder
  defstruct [
    :schedule
  ]

  @type t :: %__MODULE__{
    :schedule => ПартнерскийAPIМаркета.Model.CampaignSettingsScheduleDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:schedule, :struct, ПартнерскийAPIМаркета.Model.CampaignSettingsScheduleDto)
  end
end

