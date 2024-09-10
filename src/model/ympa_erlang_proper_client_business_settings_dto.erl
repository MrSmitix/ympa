-module(ympa_erlang_proper_client_business_settings_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_business_settings_dto/0]).

-export([ympa_erlang_proper_client_business_settings_dto/1]).

-export_type([ympa_erlang_proper_client_business_settings_dto/0]).

-type ympa_erlang_proper_client_business_settings_dto() ::
  [ {'onlyDefaultPrice', boolean() }
  | {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  ].


ympa_erlang_proper_client_business_settings_dto() ->
    ympa_erlang_proper_client_business_settings_dto([]).

ympa_erlang_proper_client_business_settings_dto(Fields) ->
  Default = [ {'onlyDefaultPrice', boolean() }
            , {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

