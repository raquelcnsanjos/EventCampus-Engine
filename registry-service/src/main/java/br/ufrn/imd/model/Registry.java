package br.ufrn.imd.model;

import java.io.Serializable;
import java.util.Objects;

public class Registry implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long eventId;
	private Long participantId;

	public Registry(Long id, Long eventId, Long participantId) {
		this.id = id;
		this.eventId = eventId;
		this.participantId = participantId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getParticipantId() {
		return participantId;
	}

	public void setParticipantId(Long participantId) {
		this.participantId = participantId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventId, id, participantId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registry other = (Registry) obj;
		return Objects.equals(eventId, other.eventId) && Objects.equals(id, other.id)
				&& Objects.equals(participantId, other.participantId);
	}
	
}
