-module(ympa_erlang_proper_client_get_outlets_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_outlets_response/0]).

-export([ympa_erlang_proper_client_get_outlets_response/1]).

-export_type([ympa_erlang_proper_client_get_outlets_response/0]).

-type ympa_erlang_proper_client_get_outlets_response() ::
  [ {'outlets', list(ympa_erlang_proper_client_full_outlet_dto:ympa_erlang_proper_client_full_outlet_dto()) }
  | {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
  | {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
  ].


ympa_erlang_proper_client_get_outlets_response() ->
    ympa_erlang_proper_client_get_outlets_response([]).

ympa_erlang_proper_client_get_outlets_response(Fields) ->
  Default = [ {'outlets', list(ympa_erlang_proper_client_full_outlet_dto:ympa_erlang_proper_client_full_outlet_dto()) }
            , {'paging', ympa_erlang_proper_client_scrolling_pager_dto:ympa_erlang_proper_client_scrolling_pager_dto() }
            , {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

