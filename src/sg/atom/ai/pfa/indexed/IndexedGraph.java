/*******************************************************************************
 * Copyright 2014 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package sg.atom.ai.pfa.indexed;

import sg.atom.core.datastructure.graph.Graph;

/** A graph for the {@link IndexedAStarPathFinder}.
 * 
 * @param <N> Type of node extending {@link IndexedNode}
 * 
 * @author davebaol */
public interface IndexedGraph<N extends IndexedNode<N>> extends Graph<N> {

	/** Returns the number of nodes. */
	public int getNodeCount ();

}
