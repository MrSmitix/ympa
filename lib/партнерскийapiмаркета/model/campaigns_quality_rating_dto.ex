# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.CampaignsQualityRatingDto do
  @moduledoc """
  Информация об индексе качества магазинов.
  """

  @derive Jason.Encoder
  defstruct [
    :campaignRatings
  ]

  @type t :: %__MODULE__{
    :campaignRatings => [ПартнерскийAPIМаркета.Model.CampaignQualityRatingDto.t]
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:campaignRatings, :list, ПартнерскийAPIМаркета.Model.CampaignQualityRatingDto)
  end
end

