# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.FeedDownloadErrorDto do
  @moduledoc """
  Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
  """

  @derive Jason.Encoder
  defstruct [
    :httpStatusCode,
    :type,
    :description
  ]

  @type t :: %__MODULE__{
    :httpStatusCode => integer() | nil,
    :type => ПартнерскийAPIМаркета.Model.FeedDownloadErrorType.t | nil,
    :description => String.t | nil
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:type, :struct, ПартнерскийAPIМаркета.Model.FeedDownloadErrorType)
  end
end

