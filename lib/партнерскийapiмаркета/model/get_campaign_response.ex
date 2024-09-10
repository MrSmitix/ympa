# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.GetCampaignResponse do
  @moduledoc """
  Информация о магазине к данным идентификатора кампании.
  """

  @derive Jason.Encoder
  defstruct [
    :campaign
  ]

  @type t :: %__MODULE__{
    :campaign => ПартнерскийAPIМаркета.Model.CampaignDto.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:campaign, :struct, ПартнерскийAPIМаркета.Model.CampaignDto)
  end
end

