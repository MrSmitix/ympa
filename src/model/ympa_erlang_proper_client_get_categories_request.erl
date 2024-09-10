-module(ympa_erlang_proper_client_get_categories_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_categories_request/0]).

-export([ympa_erlang_proper_client_get_categories_request/1]).

-export_type([ympa_erlang_proper_client_get_categories_request/0]).

-type ympa_erlang_proper_client_get_categories_request() ::
  [ {'language', ympa_erlang_proper_client_language_type:ympa_erlang_proper_client_language_type() }
  ].


ympa_erlang_proper_client_get_categories_request() ->
    ympa_erlang_proper_client_get_categories_request([]).

ympa_erlang_proper_client_get_categories_request(Fields) ->
  Default = [ {'language', ympa_erlang_proper_client_language_type:ympa_erlang_proper_client_language_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

