-module(ympa_erlang_proper_client_forward_scrolling_pager_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_forward_scrolling_pager_dto/0]).

-export([ympa_erlang_proper_client_forward_scrolling_pager_dto/1]).

-export_type([ympa_erlang_proper_client_forward_scrolling_pager_dto/0]).

-type ympa_erlang_proper_client_forward_scrolling_pager_dto() ::
  [ {'nextPageToken', binary() }
  ].


ympa_erlang_proper_client_forward_scrolling_pager_dto() ->
    ympa_erlang_proper_client_forward_scrolling_pager_dto([]).

ympa_erlang_proper_client_forward_scrolling_pager_dto(Fields) ->
  Default = [ {'nextPageToken', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

