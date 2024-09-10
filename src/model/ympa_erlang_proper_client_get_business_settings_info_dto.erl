-module(ympa_erlang_proper_client_get_business_settings_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_business_settings_info_dto/0]).

-export([ympa_erlang_proper_client_get_business_settings_info_dto/1]).

-export_type([ympa_erlang_proper_client_get_business_settings_info_dto/0]).

-type ympa_erlang_proper_client_get_business_settings_info_dto() ::
  [ {'info', ympa_erlang_proper_client_business_dto:ympa_erlang_proper_client_business_dto() }
  | {'settings', ympa_erlang_proper_client_business_settings_dto:ympa_erlang_proper_client_business_settings_dto() }
  ].


ympa_erlang_proper_client_get_business_settings_info_dto() ->
    ympa_erlang_proper_client_get_business_settings_info_dto([]).

ympa_erlang_proper_client_get_business_settings_info_dto(Fields) ->
  Default = [ {'info', ympa_erlang_proper_client_business_dto:ympa_erlang_proper_client_business_dto() }
            , {'settings', ympa_erlang_proper_client_business_settings_dto:ympa_erlang_proper_client_business_settings_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

