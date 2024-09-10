# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.OutletWorkingScheduleItemDto do
  @moduledoc """
  Расписание работы точки продаж.
  """

  @derive Jason.Encoder
  defstruct [
    :startDay,
    :endDay,
    :startTime,
    :endTime
  ]

  @type t :: %__MODULE__{
    :startDay => ПартнерскийAPIМаркета.Model.DayOfWeekType.t,
    :endDay => ПартнерскийAPIМаркета.Model.DayOfWeekType.t,
    :startTime => String.t,
    :endTime => String.t
  }

  alias ПартнерскийAPIМаркета.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:startDay, :struct, ПартнерскийAPIМаркета.Model.DayOfWeekType)
     |> Deserializer.deserialize(:endDay, :struct, ПартнерскийAPIМаркета.Model.DayOfWeekType)
  end
end

