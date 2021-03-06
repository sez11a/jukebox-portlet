/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.liferay.jukebox.service.base;

import org.liferay.jukebox.service.SongServiceUtil;

import java.util.Arrays;

/**
 * @author Julio Camarero
 * @generated
 */
public class SongServiceClpInvoker {
	public SongServiceClpInvoker() {
		_methodName86 = "getBeanIdentifier";

		_methodParameterTypes86 = new String[] {  };

		_methodName87 = "setBeanIdentifier";

		_methodParameterTypes87 = new String[] { "java.lang.String" };

		_methodName92 = "addSong";

		_methodParameterTypes92 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "java.lang.String", "java.io.InputStream",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName93 = "deleteSong";

		_methodParameterTypes93 = new String[] {
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName94 = "getSongs";

		_methodParameterTypes94 = new String[] { "long" };

		_methodName95 = "getSongs";

		_methodParameterTypes95 = new String[] { "long", "int", "int" };

		_methodName96 = "getSongs";

		_methodParameterTypes96 = new String[] { "long", "java.lang.String" };

		_methodName97 = "getSongsByAlbumId";

		_methodParameterTypes97 = new String[] { "long", "long" };

		_methodName98 = "getSongsByAlbumId";

		_methodParameterTypes98 = new String[] { "long", "long", "int" };

		_methodName99 = "getSongsCount";

		_methodParameterTypes99 = new String[] { "long" };

		_methodName100 = "getSongsCount";

		_methodParameterTypes100 = new String[] { "long", "java.lang.String" };

		_methodName101 = "getSongsCountByAlbumId";

		_methodParameterTypes101 = new String[] { "long", "long" };

		_methodName102 = "getSongsCountByAlbumId";

		_methodParameterTypes102 = new String[] { "long", "long", "int" };

		_methodName103 = "moveSongToTrash";

		_methodParameterTypes103 = new String[] { "long" };

		_methodName104 = "restoreSongFromTrash";

		_methodParameterTypes104 = new String[] { "long" };

		_methodName105 = "updateSong";

		_methodParameterTypes105 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "java.lang.String", "java.io.InputStream",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName86.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
			return SongServiceUtil.getBeanIdentifier();
		}

		if (_methodName87.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
			SongServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName92.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
			return SongServiceUtil.addSong(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.io.InputStream)arguments[3],
				(java.lang.String)arguments[4],
				(java.io.InputStream)arguments[5],
				(com.liferay.portal.service.ServiceContext)arguments[6]);
		}

		if (_methodName93.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
			return SongServiceUtil.deleteSong(((Long)arguments[0]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			return SongServiceUtil.getSongs(((Long)arguments[0]).longValue());
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return SongServiceUtil.getSongs(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return SongServiceUtil.getSongs(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return SongServiceUtil.getSongsByAlbumId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return SongServiceUtil.getSongsByAlbumId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return SongServiceUtil.getSongsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return SongServiceUtil.getSongsCount(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return SongServiceUtil.getSongsCountByAlbumId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return SongServiceUtil.getSongsCountByAlbumId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return SongServiceUtil.moveSongToTrash(((Long)arguments[0]).longValue());
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return SongServiceUtil.restoreSongFromTrash(((Long)arguments[0]).longValue());
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return SongServiceUtil.updateSong(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.io.InputStream)arguments[4],
				(java.lang.String)arguments[5],
				(java.io.InputStream)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName86;
	private String[] _methodParameterTypes86;
	private String _methodName87;
	private String[] _methodParameterTypes87;
	private String _methodName92;
	private String[] _methodParameterTypes92;
	private String _methodName93;
	private String[] _methodParameterTypes93;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName98;
	private String[] _methodParameterTypes98;
	private String _methodName99;
	private String[] _methodParameterTypes99;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
}