# NOTE: This file is auto generated by OpenAPI Generator 7.8.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule ПартнерскийAPIМаркета.Model.UnitDto do
  @moduledoc """
  Единица измерения.
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :name,
    :fullName
  ]

  @type t :: %__MODULE__{
    :id => integer(),
    :name => String.t,
    :fullName => String.t
  }

  def decode(value) do
    value
  end
end

