-module(ympa_erlang_proper_client_statem).

-behaviour(proper_statem).

-include("ympa_erlang_proper_client.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("ympa_erlang_proper_client_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% get_fulfillment_warehouses
%%==============================================================================

get_fulfillment_warehouses() ->
  ympa_erlang_proper_client_api:get_fulfillment_warehouses().

get_fulfillment_warehouses_args(_S) ->
  [].

%%==============================================================================
%% get_warehouses
%%==============================================================================

get_warehouses(BusinessId) ->
  ympa_erlang_proper_client_api:get_warehouses(BusinessId).

get_warehouses_args(_S) ->
  [integer()].

