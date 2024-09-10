-module(ympa_erlang_proper_client_get_regions_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_regions_response/0]).

-export([ympa_erlang_proper_client_get_regions_response/1]).

-export_type([ympa_erlang_proper_client_get_regions_response/0]).

-type ympa_erlang_proper_client_get_regions_response() ::
  [ {'regions', list(ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto()) }
  | {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
  ].


ympa_erlang_proper_client_get_regions_response() ->
    ympa_erlang_proper_client_get_regions_response([]).

ympa_erlang_proper_client_get_regions_response(Fields) ->
  Default = [ {'regions', list(ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto()) }
            , {'paging', ympa_erlang_proper_client_forward_scrolling_pager_dto:ympa_erlang_proper_client_forward_scrolling_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

